if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    
    average_of_the_mark = 0
    for i in range(len(student_marks[query_name])):
        average_of_the_mark += student_marks[query_name][i]
    print('%.2f' % (average_of_the_mark/len(student_marks[query_name])))