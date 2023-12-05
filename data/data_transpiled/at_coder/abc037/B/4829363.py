def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.q = int ( self.q )
        self.nums = [ ]
        for i in range ( self.q ) :
            tmp_l = _main.get ( self.tmp_l )
            tmp_r = _main.get ( self.tmp_r )
            tmp_t = _main.get ( self.tmp_t )
            for a in range ( tmp_l - 1 , tmp_r ) :
                self.nums.append ( tmp_t )
        for a in self.nums :
            print ( a )
