// to activate bot the following link should be activated first
// https://discord.com/oauth2/authorize?client_id=933948283573907536&scope=bot

require('dotenv').config();


// console.log(process.env.Discord_Bot_Token);


const { Client, Emoji, Channel } = require('discord.js');
const CBot1 = new Client({
    intents: ["GUILDS", "GUILD_MESSAGES", "DIRECT_MESSAGES"]
});
const Prefix = "$";


CBot1.on('ready', (message) => {
    console.log(`${CBot1.user.tag} has logged`);
    // console.log(message);
});

CBot1.on('message', message => {
    //----------- Get list -----------
    if (message.content === 'memlist') {
        // Get the Guild and store it under the variable "list"
        const list = CBot1.guilds.cache.get("335507048017952771");

        // Iterate through the collection of GuildMembers from the Guild getting the username property of each member 
        // list.members.forEach(member => console.log(member.user.username));
        list.members.fetch().then(members => console.log(members))
    }

})

CBot1.on('messageCreate', message => {
    if (message.author.bot) {
        return
    }
    //Bot replies to your message
    // if (message.content) {
    //     message.reply(message);
    // }

    if (message.content.startsWith(Prefix)) {
        const [COMM_NAME, ...args] = message.content
            .trim()
            .substring(Prefix.length)
            .split(/\s+/);
        // console.log(COMM_NAME);
        // console.log(args);
        if (COMM_NAME === 'kick') {
            if (args.length === 0) return message.reply('Provide ID');
            const member = message.guild.members.cache.get(args[0]); //considering only online people as members.
            console.log(member.roles);
            if (member) {
                member
                    .kick()
                    .then((member) => message.channel.send(`${member} kicked.`))
                    .catch((err) => message.channel.send('No permission'));

            } else message.channel.send('Not a member');
        }
    }






})



CBot1.login(process.env.DiscordBotToken);