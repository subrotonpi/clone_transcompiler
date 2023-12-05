def test_problem_a ( ) :
    from os import urandom
    from random import randint
    from random import choice
    class ProblemA ( object ) :
        def __init__ ( self ) :
            self.s = urandom ( 10 )
            self.arr = [ 0 ] * 26
            for c in choice ( self.s ) :
                self.arr [ c - 'A' ] += 1
        def __init__ ( self ) :
            sc = urandom ( 'A-large.in' )
            self.usecase = sc.randint ( 1 , 26 )
            for i in range ( 1 , len ( self.arr ) + 1 ) :
                print ( self.arr [ i - 'A' ] , 'Case #%d: ' % i )
                self.solve ( sc )
    def solve ( ) :
        return ProblemA ( )
    cases = [ 'ZERO' , 'ONE' , 'TWO' , 'THREE' , 'FOUR' , 'FIVE' , 'SIX' , 'SEVEN' , 'EIGHT' , 'NINE' ]
    count = [ [ 0 ] * 26 for i in range ( 10 ) ]
    todo = [ 0 ] * 10
    todo [ 0 ] = arr [ 25 ]
    todo [ 2 ] = arr [ 22 ]
    todo [ 4 ] = arr [ 'U' - 'A' ]
    todo [ 6 ] = arr [ 'X' - 'A' ]
    todo [ 8 ] = arr [ 'G' - 'A' ]
    for j in range ( 26 ) :
        arr [ j ] -= todo [ 0 ] * count [ 0 ] [ j ]
        arr [ j ] -= todo [ 2 ] * count [ 2 ] [ j ]
        arr [ j ] -= todo [ 4 ] * count [ 4 ] [ j ]
        arr [ j ] -= todo [ 6 ] * count [ 6 ] [ j ]
        arr [ j ] -= todo [ 8 ] * count [ 8 ] [ j ]
    todo [ 1 ] = arr [ 'O' - 'A' ]
    todo [ 3 ] = arr [ 'R' - 'A' ]
    todo [ 7 ] = arr [ 'S' - 'A' ]
    for j in range ( 26 ) :
        arr [ j ] -= todo [ 1 ] * count [ 1 ] [ j ]
    