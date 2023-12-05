def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = 1
            self.y = 2
    A = [ 1 , 3 , 5 , 7 , 8 , 10 , 12 ]
    B = [ 4 , 6 , 9 , 11 ]
    C = [ 2 ]
    if all ( a == 1 for a in A ) and all ( a == 2 for a in A ) :
        print ( "Yes" )
        return
    if all ( a == 1 for a in B ) and all ( a == 2 for a in B ) :
        print ( "Yes" )
        return
    if all ( a == 1 for a in C ) and all ( a == 2 for a in C ) :
        print ( "Yes" )
        return
    print ( "No" )
