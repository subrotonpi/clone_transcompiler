def _import ( ) :
    from os import popen
    from os import getenv
    from os import sep
    class B :
        def __init__ ( self ) :
            self.nbrs = [ ]
            self.N = int ( getenv ( 'ROYGBV' ) )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
            self.nbrs.append ( [ ] )
        def make_cnts ( self ) :
            ret = [ ]
            for r in range ( 6 ) :
                for s in self.nbrs :
                    ret.append ( s [ r ] )
            return ret
        def is_in ( self , x ) :
            for i in self.a :
                if i == x : return True
            return False
        def get_next ( self , last , first , c , is_final ) :
            ret = - 1
            ret_first = True
            cnts = make_cnts ( self )
            for i in self.T :
                in_last = False if last == - 1 else is_in ( self.nbrs [ last ] , i )
                in_first = False if first == - 1 else is_in ( self.nbrs [ first ] , i )
                if in_last or c [ i ] == 0 or is_final and in_first : continue
                if ret == - 1 or self.nbrs [ ret ] < cnts [ i ] or self.nbrs [ ret ] == cnts [ i ] and not ret_first and in_first :
                    ret = i
                    ret_first = in_first
                    