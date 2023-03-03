def import _large
import os
import sys
import binascii
import binascii
import os
import sys
import binascii
import binascii
import sys
import binascii
import os
import sys
sys.stdin = sys.stdout = sys.__stdin__
sys.stdout = sys.__stdout__
sys.stderr = sys.__stderr__
output = ""
t = sys.stdin.readline ( )
sys.stdout.write ( output )
for i in range ( 1 , t + 1 ) :
    n = sys.stdin.readline ( )
    j = sys.stdin.readline ( )
    num = ( 1l << ( n - 1 ) ) + 1
    count = 0
    output += "Case #%d:\n" % i
    while count < j :
        s = binascii.unhexlify ( num )
        found = True
        factors = [ ]
        for k in range ( 2 , 10 ) :
            big = binascii.unhexlify ( s )
            if big == b'' :
                found = False
                break
            factor = - 1
            for m in range ( 3 , 1000 , 2 ) :
                if big % b''.ljust ( m ) :
                    factor = m
                    break
            if factor == - 1 :
                found = False
                break
            factors.append ( factor )
        if found :
            count += 1
            output += s
            for k in factors :
                output += " " + str ( k )
            output += "\n"
        num += 2
f = open ( "src/C-large.out" , "w" , encoding = "utf-8" )
f.write ( output )
f.close ( )
