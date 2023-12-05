def gcj2015.qualif ( ) :
    import os
    import os
    import sys
    import os.path
    import sys
    import os.path
    import sys
    import logging
    import logging
    logging.basicConfig ( level = logging.DEBUG )
    import logging
    logging.getLogger ( 'gcj2015.qualif' ).setLevel ( logging.INFO )
    logging.getLogger ( 'gcj2015.qualif' ).setLevel ( logging.DEBUG )
    logging.getLogger ( 'gcj2015.qualif' ).setLevel ( logging.DEBUG )
    class ExoC ( object ) :
        def __init__ ( self , x ) :
            self.U = 1
            self.I = 2
            self.J = 3
            self.K = 4
            self.quaternions = ( [ self.U , self.I , self.J , self.K ] , [ self.I , - self.K , self.J ] , [ self.J , - self.K , - self.I ] , [ self.K , self.J , - self.I , - self.U ] ] )
        def main ( self ) :
            base = '/home/jean/gcj2015/q/ExoC/'
            input = base + 'b1.in'
            output = base + 'b1.out'
            try :
                with open ( input , 'r' ) as f :
                    n = len ( f.readlines ( ) )
                    f.readline ( )
                    for c in range ( n ) :
                        print ( 'Test case %d...' % ( c + 1 ) )
                        f.write ( 'Case #%d: ' % ( c + 1 ) )
                        self.test ( f )
                        f.write ( '\n' )
                    f.write ( '\n' )
                    f.flush ( )
                    f.close ( )
            except IOError as ex :
                logging.getLogger ( 'gcj2015.qualif' ).setLevel ( logging.ERROR )
        def check ( self , s ) :
            L = len ( f.readlines ( ) )
            X , s = f.readlines ( )
            ss = ''
            if X < 16 :
                for i in range ( X ) :
                    ss = ss + s
            else :