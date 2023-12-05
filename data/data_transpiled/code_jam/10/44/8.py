def _import ( ) :
    from math import sin , cos , cos
    from os import chdir , getcwd
    class SolD ( object ) :
        def __init__ ( self ) :
            self._import ( )
        def solve ( self ) :
            try :
                locale.setlocale ( locale.LC_ALL , '' )
                f = open ( FNAME + '.in' , 'r' )
                out = open ( FNAME + '.out' , 'w' )
                self.solve ( )
                out.close ( )
            except IOError :
                pass
    if chdir ( getcwd ( ) ) :
        os.chdir ( chdir ( getcwd ( ) ) )
    else :
        os.chdir ( getcwd ( ) )
    if os.path.isfile ( FNAME + '.in' ) :
        f = open ( FNAME + '.in' , 'r' )
        out = open ( FNAME + '.out' , 'w' )
        self.solve ( )
        out.close ( )
    if os.path.isfile ( FNAME + '.out' ) :
        os.remove ( FNAME + '.out' )
    if os.path.isfile ( FNAME + '.in' ) :
        os.remove ( FNAME + '.in' )
    if os.path.isfile ( FNAME + '.out' ) :
        os.remove ( FNAME + '.out' )
    if os.path.isfile ( FNAME + '.in' ) :
        os.remove ( FNAME + '.in' )
    if os.path.isfile ( FNAME + '.out' ) :
        os.remove ( FNAME + '.out' )
    if os.path.isfile ( FNAME + '.in' ) :
        os.remove ( FNAME + '.in' )
    if os.path.isfile ( FNAME + '.out' ) :
        os.remove ( FNAME + '.out' )
    else :
        os.remove ( FNAME + '.in' )
    os.rename ( FNAME + '.out' , FNAME + '.out' )
    return
