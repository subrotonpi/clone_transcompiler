def main ( ) :
    import sys
    from random import randint
    from student import Student
    from student import Student
    from student import Student
    from student import Student
    from student import Student
    from student import Student
    from student import Student
    from student import Student
    N = randint ( 1 , N )
    a = [ Student ( i + 1 , i ) for i in range ( N ) ]
    a.sort ( lambda s1 , s2 : s2.height - s1.height )
    for i in range ( N ) : print ( a [ i ].id )
