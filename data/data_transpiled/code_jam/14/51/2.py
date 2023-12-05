def _import ( ) : return float ( next ( ) )
def atoi ( next ( ) ) : return int ( next ( ) )
def randrange ( ) : return long ( next ( ) )
def min ( ) : return float ( next ( ) )
def exit ( ) : return sys.exit ( )
def main ( ) :
    try :
        f = sys.stdin
    except AttributeError :
        f = open ( '/dev/null' , 'w' )
        f.close ( )
    tests = randrange ( 1 , 2 )
    for test in range ( 1 , tests + 1 ) :
        f.close ( )
    try :
        f.close ( )
    except AttributeError :
        pass
    else :
        f.close ( )
