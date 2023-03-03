def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self._tmp = os.popen ( '/usr/bin/cat -c "cat -d" /usr/bin/cat "' )
            self._out = ""
            self.i_len = len ( self._tmp )
            for c_tmp in self._tmp :
                if c_tmp == '0' :
                    self._out = self._out.ljust ( 6 )
                elif c_tmp == '1' :
                    self._out = self._out.ljust ( 6 )
                elif c_tmp == 'B' :
                    if self._out [ - 1 ] == '\n' :
                        self._out = self._out [ : - 1 ]
            print ( self._out )
