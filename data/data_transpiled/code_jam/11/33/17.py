def _import ( ) : return _import ( "" , "" , "" )
class CC :
    def _in ( self ) : return open ( self._file , "r" )
    def _string ( self ) : return ""
    def _stok ( self ) : return [ s for s in self._file ]
    def nxt ( self ) : return _stok ( )
    def nxw ( self ) :
        while not self._stok ( ) :
            try : self.raw_input ( )
            except IOError : pass
        return _stok ( )
    def nxi ( self ) : return int ( self )
    def nxl ( self ) : return long ( self )
    def nxf ( self ) : return float ( self )
    def nxd ( self ) : return double ( self )
    def nxb ( self ) : return b
    def dprint ( self , * args ) :
        if self.debug : print ( self._print_ ( * args ) , * args )
    def dprintln ( self , * args ) :
        if self.debug : print ( self._print_ ( * args ) , * args )
    def dprintf ( self , * args ) :
        if self.debug : print ( self._print_ ( * args ) , * args )
    def debug ( self ) :
        self.debug = False
    def main ( self ) :
        self.raw_input ( )
