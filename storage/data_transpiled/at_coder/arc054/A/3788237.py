def import import sys
class Main ( object ) :
    def solve ( self ) :
        L , X , Y , S , D = self.raw_input ( )
        ans = float ( 'inf' )
        if D >= S :
            ans = float ( D - S ) / ( X + Y )
            if X < Y :
                ans = min ( ans , float ( L - D + S ) / ( Y - X ) )
        else :
            ans = float ( L - S + D ) / ( X + Y )
            if X < Y :
                ans = min ( ans , float ( S - D ) / ( Y - X ) )
        print ( ans )
