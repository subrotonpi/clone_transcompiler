def world2014.qualification_round ( ) :
    import os
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import sys
    class MinesweeperMaster ( object ) :
        def solve ( self , R , C , M ) :
            if R < C :
                res = self.solve ( C , R , M )
                if res == 'Impossible' : return res
                lines = [ ]
                for i in range ( 1 , M ) :
                    splitted = line.split ( '*' )
                    R = int ( splitted [ 0 ] )
                    C = int ( splitted [ 1 ] )
                    M = int ( splitted [ 2 ] )
                return ''.join ( lines )
            mm = R * C - M
            if mm == 1 or C == 1 :
                return self.createBoard ( mm , M )
            if mm == 2 or mm == 3 or mm == 5 or mm == 7 :
                return 'Impossible'
            if mm % 2 == 1 :
                return 'Impossible'
            return self.createBoard ( mm , M )
        else :
            if mm % 2 == 0 :
                s = res [ r * C : ( r + 1 ) * C ]
                print ( s )
            return ''.join ( s )
    elif mm % C != 1 :
        return self.createBoard ( mm , M )
    elif mm >= 1 :
        return self.createBoard ( mm , M )
    else :
        return self.createBoard ( mm , M )
