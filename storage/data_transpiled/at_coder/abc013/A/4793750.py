def main ( ) :
    import re
    import sys
    from itertools import count
    x = sys.stdin.read ( )
    sys.stdin.close ( )
    alphabets = [ 'A' , 'B' , 'C' , 'D' , 'E' ]
    order = count ( alphabets ) + 1
    print ( order )
