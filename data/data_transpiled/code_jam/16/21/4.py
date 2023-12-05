def _import ( * args , ** kwargs ) :
    from io import StringIO
    from sys import stdin
    from os import environ
    from os import environ
    from os import chdir
    from os.environ import environ
    from os import chdir
    from os.environ import environ
    from os import chdir
    from string import ascii_letters
    from os.path import expanduser
    from os.environ import environ
    from os.chdir ( environ [ 'HOME' ] )
    S = [ 'ZERO' , 'ONE' , 'TWO' , 'THREE' , 'FOUR' , 'FIVE' , 'SIX' , 'SEVEN' , 'EIGHT' , 'NINE' ]
    id = [ 0 , 'z' , 2 , 'w' , 6 , 'x' , 8 , 'g' , 7 , 's' , 5 , 'v' , 4 , 'f' , 3 , 't' , 1 , 'o' , 9 , 'i' ]
    def solve ( ) :
        count = [ 0 ] * 256
        for c in cs :
            count [ c ] += 1
        res = { }
        for i in range ( 10 ) :
            c = unicodedata.normalize ( 'NFKD' , id [ i * 2 + 1 ] )
            num = ord ( count [ c ] )
            res [ id [ i * 2 ] ] = num
            for d in S [ id [ i * 2 ] ] :
                count [ d ] -= num
        for i in range ( 10 ) :
            for j in res [ i ] :
                print ( i , end = ' ' )
        print ( )
    def run ( ) :
        caseN = environ.get ( 'NINE' )
        for caseID in range ( 1 , caseN + 1 ) :
            read ( )
            print ( "Case #%d: " % caseID )
            solve ( )
            sys.stdout.flush ( )
    debug ( * args , ** kwargs )
