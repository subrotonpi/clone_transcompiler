def main ( args ) :
    import sys
    import os
    import subprocess
    import subprocess
    import sys
    import subprocess
    import sys
    import time
    import string
    input = open ( 'input.txt' , 'r' )
    input.readline ( )
    values = input.read ( ).split ( )
    input.close ( )
    ary = [ int ( i ) for i in values ]
    ary = [ i for i in ary if i ]
    print ( ary [ - 1 ] - ary [ 0 ] )
