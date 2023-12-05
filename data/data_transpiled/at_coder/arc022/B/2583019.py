def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 100
            self.S = [ ]
            self.tast = { }
            with open ( "/proc/stations" , "r" ) as sc :
                N = sc.read ( )
    ans = 0
    l , r = 0 , 0
    while l < N :
        while r < N and self.tast [ S [ r ] ] == 0 :
            self.tast [ S [ r ] ] = 1
            r += 1
        ans = max ( ans , r - l )
        self.tast [ S [ l ] ] = 0
        l += 1
    print ( ans )
