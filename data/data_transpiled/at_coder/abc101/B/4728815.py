def main ( ) :
    import sys
    import json
    class Main ( object ) :
        def __init__ ( self ) :
            self.data = sys.stdin.read ( )
    num = int ( sys.argv [ 1 ] )
    sum = sum ( [ int ( x ) for x in str.split ( '' ) ] )
    ans = 'Yes' if num % sum == 0 else 'No'
    print ( ans )
