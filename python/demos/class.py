class Person:
	def __init__(self, name, age):
		self.name = name
		self.age = age
	def myfunc(self):
		print("Hello, my name is " + self.name)
	def myfunc2(self):
		print("I am " + self.age + " years old.")

# print('Enter a name:')
inputname = input('Enter a name:\n')

# print('Enter an age:')
inputage = input('Enter an age:\n')

p1 = Person(inputname, inputage)

p1.myfunc()
p1.myfunc2()
