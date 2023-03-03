def main ( ) :
    import sys
    from random import randint
    from time import sleep
    stdin = sys.stdin
    inputs = [ int ( i ) for i in stdin.readline ( ).split ( ) ]
    fee = [ int ( i ) for i in stdin.readline ( ).split ( ) ]
    left = sum ( fee < i for i in inputs [ 2 : ] )
    right = sum ( fee > i for i in inputs [ 2 : ] )
    print ( min ( left , right ) )
