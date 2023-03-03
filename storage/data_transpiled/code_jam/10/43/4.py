def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import sys
import termios
import sys
import termios
import sys
import time
import time
import sys
INF = 10000000
def solve ( ) :
    n = int ( readword ( ) )
    color = [ ]
    a = [ ]
    for i in range ( n ) :
        if a [ i ].can_join ( a [ j ] ) :
            color.append ( i )
    for i in range ( 120 ) :
        for j in range ( n ) :
            if color [ j ] == i :
                has_color = True
                break
    for i in range ( - INF ) :
        for j in range ( 30 ) :
            print ( tbl [ i ] , end = '' )
    print ( )
def solve ( ) :
    for i in range ( 120 ) :
        for j in range ( n ) :
            if color [ j ] == i :
                has_color = True
                break
    for i in range ( - INF ) :
        for j in range ( n ) :
            if color [ j ] == i :
                ms = max ( i , j )
                mf = min ( i , j )
                return mf - ms >= - 1
        for j in range ( n ) :
            if color [ j ] == i :
                tmp = i
                if j > j :
                    answer = i
        print ( ( answer + 1 ) + '\n' )
    def readword ( ) :
        c = stdin.read ( )
        while c >= 0 and c <= '' :
            c = stdin.read ( )
            if c < 0 : return ''
            bld = [ ]
            while c > '' :
                bld.append ( c )
                c = stdin.read ( )
        return bld
    def solve ( ) :
        count = 0
        while True :
            flag = False
            for i in range ( n ) :
                for j in range ( n ) :
                    if color [ i ] == j :
                        flag = True
            if not flag : break
        next = [ ]
        for i in range ( n