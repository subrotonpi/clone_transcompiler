def _import ( ) :
    from os import path
    from os import open
    from os import stat
    from collections import defaultdict
    class C :
        def __init__ ( self ) :
            with open ( "C-large.in" , "r" ) as f :
                self._file = f.read ( )
        def __init__ ( self , f ) :
            self._file = open ( "C-large.out" , "w" )
            self._file.close ( )
        def __init__ ( self , b , t , bc ) :
            self.b = b
            self.t = t
            self.bc = bc
            self.tc = t
        def __eq__ ( self , o ) :
            rhs = self.b
            if self.b == rhs.b and self.t == rhs.bc and self.tc == rhs.tc :
                return True
            return False
        def __lt__ ( self , rhs ) :
            l = self.b * 100 + self.t
            r = rhs.b * 100 + self.t
            b_type = [ ]
            t_type = [ ]
            for i in range ( N ) :
                boxes.append ( self._file.read ( ) )
                b_type.append ( self._file.read ( ) )
            for i in range ( M ) :
                toys.append ( self._file.read ( ) )
                t_type.append ( self._file.read ( ) )
            dict = defaultdict ( int )
            print ( "Case #%d: %s" % ( self.t , doDp ( dict , boxes , b_type , toys , t_type , ( 0 , 0 , boxes [ 0 ] , toys [ 0 ] ) ) ) )
    def do_cp ( dict , boxes , b_type , toys , t_type , state ) :
        if state in dict :
            return dict [ state ]
        if state.b == len ( boxes ) or state.t == len ( toys ) :
            return 0
        if b_type [ state.b ] == t_type [ state.t ] :
            ret = min ( state.bc , state.t )
            new_state = { }
            new_state [ state.b ] = ret
            new_state [ state.t ] = ret
            return ret
        