def calculator():
    num1 = int(input("Enter the first number: "))
    num2 = int(input("Enter the second number: "))

    print("Select operation:")
    print("1. Addition:(+)")
    print("2. Subtraction:(-)")
    print("3. Multiplication:(*)")
    print("4. Division:(/)")

    choice = input("Enter choice (1/2/3/4): ")

    if choice in ('1', '2', '3', '4'):
        if choice == '1':
            result = num1 + num2
            print(f"{num1} + {num2} = {result}")
        elif choice == '2':
            result = num1 - num2
            print(f"{num1} - {num2} = {result}")
        elif choice == '3':
            result = num1 * num2
            print(f"{num1} * {num2} = {result}")
        elif choice == '4':
            if num2 != 0:
                result = num1 / num2
                print(f"{num1} / {num2} = {result}")
            else:
                print("Cannot divide by zero.")
    else:
        print("Invalid input. Please enter a valid operation choice.")


calculator()
