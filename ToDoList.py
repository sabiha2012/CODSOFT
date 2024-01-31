class ToDoList:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)
        print(f'Task "{task}" added successfully!')

    def view_tasks(self):
        if not self.tasks:
            print('No tasks in the list.')
        else:
            print('Tasks:')
            for i, task in enumerate(self.tasks, start=1):
                print(f'{i}. {task}')

    def update_task(self, index, new_task):
        if 1 <= index <= len(self.tasks):
            self.tasks[index - 1] = new_task
            print(f'Task {index} updated successfully!')
        else:
            print('Invalid task index.')

    def remove_task(self, index):
        if 1 <= index <= len(self.tasks):
            removed_task = self.tasks.pop(index - 1)
            print(f'Task {index} "{removed_task}" removed successfully!')
        else:
            print('Invalid task index.')


def main():
    todo_list = ToDoList()

    while True:
        print('\nTO-DO LIST MENU:')
        print('1. Add Task')
        print('2. View Tasks')
        print('3. Update Task')
        print('4. Remove Task')
        print('5. Quit')

        choice = input('Enter your choice (1-5): ')

        if choice == '1':
            task = input('Enter the task: ')
            todo_list.add_task(task)
        elif choice == '2':
            todo_list.view_tasks()
        elif choice == '3':
            index = int(input('Enter the task index to update: '))
            new_task = input('Enter the new task: ')
            todo_list.update_task(index, new_task)
        elif choice == '4':
            index = int(input('Enter the task index to remove: '))
            todo_list.remove_task(index)
        elif choice == '5':
            print('Exiting TO-DO LIST. Goodbye!')
            break
        else:
            print('Invalid choice. Please enter a number between 1 and 5.')


if __name__ == "__main__":
    main()
