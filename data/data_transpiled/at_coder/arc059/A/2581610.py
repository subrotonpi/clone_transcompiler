def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    arr = [ stdin.read ( ) for i in range ( N ) ]
    change = 200 * 200 * 100
    for i in range ( - 100 , 100 ) :
        temp = 0
        for j in range ( N ) :
            temp += ( i - arr [ j ] ) ** 2
        if temp < change :
            change = temp
    sys.stdout.write ( change )
