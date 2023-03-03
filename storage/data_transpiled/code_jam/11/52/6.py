def import win32pipe
import os
import sys
import getopt
import win32pipe
import win32pipe
import win32pipe
import win32pipe
import win32pipe
import win32console
import win32pipe
import win32console
import win32pipe
import win32console
import win32pipe
import win32console
import win32console
import win32pipe
import win32console
import win32pipe
MAX = 20000
def solve ( f ) :
    n = win32pipe.GetStdHandle ( )
    if n == 0 :
        return "0"
    a = [ 0 ] * MAX
    for i in range ( n ) :
        a [ - 1 ] += 1
    l = 1
    r = n + 1
    main :
    while r > l + 1 :
        m = ( l + r ) // 2
        aa = a + [ 0 ] * MAX
        b = [ 0 ] * MAX + [ 0 ]
        for i in range ( MAX ) :
            while aa [ i ] > 0 :
                if i > 0 and b [ i - 1 ] > 0 :
                    b [ i - 1 ] -= 1
                    b [ i ] += 1
                    aa [ i ] -= 1
                else :
                    ok = 1
                    for j in range ( i , i + m ) :
                        if aa [ j ] == 0 : ok = 0
                        aa [ j ] -= 1
                    if not ok :
                        r = m
                        continue main
                    b [ i + m - 1 ] += 1
        l = m
    return "%d" % l
