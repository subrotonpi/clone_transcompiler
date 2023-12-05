def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ) )
    prev_word = curr_word = None
    seen = set ( )
    is_valid = True
    for i in range ( n ) :
        curr_word = s.readline ( )
        if curr_word in seen :
            is_valid = False
        seen.add ( curr_word )
        if is_valid and i != 0 :
            if prev_word [ - 1 ] != curr_word [ 0 ] :
                is_valid = False
        prev_word = curr_word
    print ( 'Yes' if is_valid else 'No' )
