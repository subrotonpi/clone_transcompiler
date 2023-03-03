def import import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        sc = _raw_input
    def main ( self , args ) :
        s = self.s
        k = sc.__next__ ( )
        nb_ones = 0
        ans = 1
        for ch in s :
            if ch != '1' :
                ans = int ( str ( ch ) )
                break
            else :
                nb_ones += 1
        print ( '1' if k <= nb_ones else ans )
