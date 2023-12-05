def _import ( ) : return float ( next ( ) )
def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _exit ( ) : return exit ( )
def _import ( ) :
    try :
        f = open ( '/dev/null' )
    except IOError :
        f = sys.stdout
    else :
        f = open ( '/dev/null' , 'w' )
    tests = randint ( 1 , 10 )
    for test in tests :
        _import ( )
    f.close ( )
    sys.exit ( 1 )
