def main ( ) :
    import sys
    import os
    import subprocess
    num = [ ]
    with open ( '/proc/main.txt' , 'r' ) as sc :
        for i in range ( 3 ) :
            num.append ( sc.read ( ) )
        num.sort ( )
        if num [ 0 ] == num [ 1 ] :
            print ( num [ 2 ] )
        else :
            print ( num [ 0 ] )
