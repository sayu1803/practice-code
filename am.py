def decimal_to_binary(decimal):
    binary = bin(decimal)[2:]  # Convert decimal to binary
    return binary


def is_palindrome(number):
    return number == number[::-1]  # Check if the number is a palindrome


decimal = int(input("Enter a decimal number: "))
binary = decimal_to_binary(decimal)
print("Binary representation:", binary)

if is_palindrome(binary):
    print("The binary number is a palindrome.")
else:
     print("The binary number is not a palindrome.")