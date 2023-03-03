def _import ( ) :
    from os import system , PIPE , I , O
    from os.path import join , dirname , dirname , basename , FileType
    from os.path import join , dirname , dirname , basename , FileType
    sc = SC ( sys.stdin )
    dp = [ ]
    mae = sc.randint ( 0 , 51 )
    ato = sc.randint ( 0 , 51 )
    INF = 1000000007
    dp.insert ( INF , 0 )
    dp.append ( 1 )
    dp.append ( 2 )
    dp.append ( 3 )
    dp.append ( 2 )
    dp.append ( 1 )
    dp.append ( 2 )
    dp.append ( 3 )
    dp.append ( 2 )
    dp.append ( 3 )
    dp.append ( 2 )
    dp.append ( 1 )
    for i in range ( 11 , 50 ) :
        dp [ i ] = i / 10 + dp [ i % 10 ]
    pl ( dp [ abs ( mae - ato ) ] )
    class SC ( object ) :
        def __init__ ( self , file = None ) :
            self.file = file
            self.tokenizer = None
        def readline ( self ) :
            if not self.tokenizer or not self.tokenizer :
                try :
                    self.tokenizer = iter ( self.tokenizer )
                except StopIteration :
                    raise IOError ( "tokenizer must be a list" )
            return self.tokenizer
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return long ( next ( self ) )
        def nextDouble ( self ) :
            return float ( next ( self ) )
        def readline ( self ) :
            try :
                return self.reader.readline ( )
            except StopIteration :
                raise IOError ( "reader must be a list" )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
