def import solve
import sys
solve ( )
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as sc :
        s = sc.read ( )
        k = sc.read ( )
    lst = [ ]
    dict = { }
    for i in range ( len ( s ) ) :
        for j in range ( 1 , 5 ) :
            if i + j > len ( s ) :
                break
            t = s [ i : i + j ]
            if t not in dict :
                dict [ t ] = 1
                lst.append ( t )
    lst.sort ( )
    print ( lst [ k - 1 ] )
