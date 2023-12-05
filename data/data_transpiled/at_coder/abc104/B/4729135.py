def main ( ) :
    import re
    import sys
    import re
    class Main ( object ) :
        def __init__ ( self ) :
            self.data = ( open ( sys.stdin.fileno ( ) ).read ( ) )
    ans = re.match ( r'^A[a-z]+C[a-z]+$' , str ( sys.stdin.read ( ) ) ).group ( 1 )
    print ( ans )
