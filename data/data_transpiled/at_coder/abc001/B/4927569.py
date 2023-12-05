def main ( ) :
    import sys
    try :
        with open ( 'README.rst' ) as f :
            h1 = f.read ( )
            h2 = f.read ( )
        print ( h1 - h2 )
    except :
        print ( '\n\n\n' )
