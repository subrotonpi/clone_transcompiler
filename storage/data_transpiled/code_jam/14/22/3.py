def _double ( ) : return float ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _long ( ) : return long ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _double ( ) : return float ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return long ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return float ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return long ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return float ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return long ( '-' + str ( random.randint ( 0 , 255 ) ) )
def _random ( ) : return _random ( )
def _random ( ) :
    try :
        f = _random ( )
    except ( IndexError , ValueError ) :
        sys.stderr.write ( 'Invalid input line: %r' % ( _random ( ) , ) )
        return
    else :
        f = _random ( )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.truncate ( )
    f.write ( '' )
    f.seek ( 0 )
    f.write ( '' )
    f.close ( )
