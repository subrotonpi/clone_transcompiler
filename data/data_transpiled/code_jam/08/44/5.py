def _main ( ) :
    import os
    import sys
    class PermRLE ( object ) :
        def __init__ ( self ) :
            self.problemID = __name__
            self.problemType = "big"
            self.stdin = open ( self.problemID + "_" + self.problemType + ".in" , "r" )
            self.stdout = open ( self.problemID + "_" + self.problemType + ".out" , "w" )
            self.stdout.write ( "Case #" + self.testNumber + ": " + str ( self.ans ) )
        def solve ( self , k , s , first , last ) :
            [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        for mask in range ( ( 1 , k ) ) :
            [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        [ self.ans , self.cur ] = self.ans
    def solve ( self , k , s , first , last ) :
        [ self.ans , self.cur ] = self.ans
    for mask in range ( ( 1 , k ) ) :
        if mask & ( 1 , first ) == 0 :
            continue
        if mask & ( 1 , last ) == 0 :
            continue
        place = - 2
        for i in range ( k ) :
            if mask & ( 1 , i ) != 0 :
                place += 1
        for prev in range ( k ) :
            if mask & ( 1 , prev ) != 0 :
                continue
            for next in range ( k ) :
                if mask & ( 1 , next ) != 0 :
                    continue
                new_mask = mask | (