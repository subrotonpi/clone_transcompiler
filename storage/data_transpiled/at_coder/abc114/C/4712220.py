def import import string
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.input = int ( sc.read ( ) )
        print ( self.dfs ( None ) )
    def dfs ( s ) :
        if s > self.input :
            return 0
        str_val = str ( s )
        val = 0
        if "3" in str_val and "5" in str_val and "7" in str_val :
            val = 1
        val += self.dfs ( s * 10 + 3 )
        val += self.dfs ( s * 10 + 5 )
        val += self.dfs ( s * 10 + 7 )
        return val
