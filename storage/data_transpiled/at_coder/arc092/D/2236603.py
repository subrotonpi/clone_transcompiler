def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( None , '' , os.getpid ( ) )
        def __init__ ( self , * args ) :
            self._import ( )
            for j in self._g :
                self._paint_min ( self._g [ j ] , self._g [ j ] , self._g [ j ] )
        def _tr ( self , * args ) :
            print ( "".join ( self._g [ : ] ) )
    def _go ( self , cur , ori ) :
        self._go [ ori ] [ cur ] = True
        for dst in self._g [ cur ] :
            if not self._go [ ori ] [ dst ] :
                self._go [ ori ] [ dst ] = True
        for dst in self._g [ cur ] :
            if dst in self._g :
                self._g [ cur ] [ dst ] = True
    def _paint_min ( self , cur , ori , col , min ) :
        if min [ cur ] > col :
            self._g [ cur ] = col
        else :
            return
        for dst in self._g [ cur ] :
            if dst == ori :
                continue
            self._g [ cur ] = [ ]
    def _tr ( self , * args ) :
        sc = subprocess.Popen ( [ "/bin/sh" , "--" , "--" ] , stdout = subprocess.PIPE )
        N = sc.wait ( )
        M = sc.wait ( )
        a = [ ]
        b = [ ]
        g = [ ]
        ref = [ ]
        for i in range ( N ) :
            for j in range ( N ) :
                self._g [ i ] [ j ] = - 1
        for j in range ( M ) :
            self._g [ cur ] [ j ] = 1
    go = _go ( self , * args )
    _go ( self , * args )
