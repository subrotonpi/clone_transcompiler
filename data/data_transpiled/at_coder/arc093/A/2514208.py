def import solve
import sys
def main ( ) :
    solve ( )
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as sc :
        n = sc.read ( )
        a = sc.read ( )
    num = 0
    for i in range ( 1 , n + 1 ) :
        num += int ( abs ( a [ i ] - a [ i + 1 ] ) )
    for i in range ( 1 , n + 1 ) :
        print ( num - int ( abs ( a [ i - 1 ] - a [ i ] ) ) - int ( abs ( a [ i ] - a [ i + 1 ] ) ) + int ( abs ( a [ i - 1 ] - a [ i + 1 ] ) ) )
