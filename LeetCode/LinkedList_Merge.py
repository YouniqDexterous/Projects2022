#design a linked list that has add, remove, and search methods
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    def add(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = Node(data)
        self.size += 1
    
    def add_at_index(self, index, data):
        if index > self.size:
            return
        elif index == 0:
            temp = self.head
            self.head = Node(data)
            self.head.next = temp
        else:
            temp = self.head
            for i in range(index-1):
                temp = temp.next
            new_node = Node(data)
            new_node.next = temp.next
            temp.next = new_node
        self.size += 1

    def remove(self, data):
        if self.head == None:
            return
        elif self.head.data == data:
            self.head = self.head.next
        else:
            temp = self.head
            while temp.next != None:
                if temp.next.data == data:
                    temp.next = temp.next.next
                    return
                temp = temp.next
        self.size -= 1
    
    

    def search(self, data):
        if self.head == None:
            return False
        else:
            temp = self.head
            while temp != None:
                if temp.data == data:
                    return True
                temp = temp.next
            return False
        
    
    def add_at_tail(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = Node(data)
        self.size += 1

    def print_list(self):
        temp = self.head
        while temp != None:
            print(temp.data)
            temp = temp.next




class Solution:
    def mergeTwoLists(self, list1: LinkedList, list2:LinkedList):
        final_list = LinkedList()
        # when 2 lists are not empty
        while list1.head != None and list2.head != None:

            #if list1's head is smaller than list2's head
            if list1.head.data < list2.head.data:
                # add list1's head to final_list
                final_list.add_at_tail(list1.head.data)
                # move list1's head to next node
                list1.head = list1.head.next
            else:
                # add list2's head to final_list
                final_list.add_at_tail(list2.head.data)
                # move list2's head to next node
                list2.head = list2.head.next
        # when list1 is empty
        while list1.head != None:
            # add list1's head to final_list
            final_list.add_at_tail(list1.head.data)
            # move list1's head to next node
            list1.head = list1.head.next
        # when list2 is empty
        while list2.head != None:
            # add list2's head to final_list
            final_list.add_at_tail(list2.head.data)
            # move list2's head to next node
            list2.head = list2.head.next
        # move list2's tail to
        return final_list
        
            
        
        
        
        
def main():
    #populate linked list
    list1 = LinkedList()
    #create list1 = [1,2,4]
    list1.add(1)
    list1.add(2)
    list1.add(4)
    #create list2 = [1,3,4]
    list2 = LinkedList()
    list2.add(1)
    list2.add(3)
    list2.add(4)    
    

    sol = Solution()
    final_list = sol.mergeTwoLists(list1, list2)
    while final_list.head != None:
        print(final_list.head.data)
        final_list.head = final_list.head.next
    



main()
