name = input('Enter Your name : ')

print(name, end=' ')
a = float(input('Enter a Number : '))
print()

print('Multiplication Table for ', a)
print()
for i in range(1, 11):
    print(f"{a}X{i}={a * i}")
print()

print('Exponent Table for ', a)
print()
for i in range(1, 11):
    print(f"{a}^{i}={a**i}")
print()
