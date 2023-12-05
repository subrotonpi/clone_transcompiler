def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.read ( ) )
    max_length = sys.stdin.read ( )
    other_length = max_length
    for i in range ( 1 , n - 1 ) :
        current_length = sys.stdin.read ( )
        other_length = other_length + current_length
        if max_length <= current_length :
            max_length = current_length
    other_length = other_length - max_length
    if max_length < other_length :
        print ( "Yes" )
    else :
        print ( "No" )
