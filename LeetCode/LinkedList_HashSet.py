class Node:
	def __init__(self, val,next=None):
		self.val = val
		self.next = next

class MyHashSet:

	def __init__(self):
		self.head = None
		self.size = 0
		
	"""
	since the Question did not specify that the key is added in Sorted order
	we are adding at the intital position and hence there is no need to 
	check if the HashSet is empty while adding.
	"""
	def add(self, key: int) -> None:
		#it does not matter if the node is null just checking will 
		# cover both cases
		
		# if self.head == None:
		#     self.head = Node(key)
		if not self.contains(key):
			#create a node with the key
			temp = Node(key)
			#add at the head so new_node.next is head
			temp.next = self.head
			#make the new_node as head
			self.head= temp 
		self.size += 1 
			
	def remove(self, key: int) -> None:
		#check for empty list
		if self.head == None:
			return 
		#check if the head is the key
		elif self.head.val == key:
			self.head = self.head.next
			return 
		#check if the key is in the middle or end
		else:
			temp = self.head
			while temp and temp.next:
				#once key is found remove
				if temp.next.val == key:
					"""
					prev is set to next node
					so node which current points is updated
					to prev node
					"""
					temp.next = temp.next.next
					break
				temp = temp.next
		self.size -= 1




	def contains(self, key: int) -> bool:
		"""
		no need to check for empty list as the 
		temp and while loop will take care of it
		and return False

		if self.head == None:
			return False
		elif self.head.val == key:
			return True
		else:
		"""
		
		temp = self.head
		while temp:
			if temp.val==key:
				return True
			temp = temp.next

		return False
	
	def display(self):
		temp = self.head
		while temp:
			print(temp.val)
			temp = temp.next

	   
		


# Your MyHashSet object will be instantiated and called as such:
def main():
	obj = MyHashSet()
	obj.add(1)
	obj.add(2)
	obj.add(3)
	obj.add(4)
	#temp1 = obj.head
	obj.display()
	
	obj.remove(3)
	obj.contains(4)
	obj.contains(3)
	obj.display()
main()