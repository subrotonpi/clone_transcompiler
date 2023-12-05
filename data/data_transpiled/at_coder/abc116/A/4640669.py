def import import sys , string , * , line , ** kwargs ) :
    from myio import Scanner , MyScanner
    from myio import StringIO
    class MyScanner ( Scanner ) :
        def __init__ ( self ) :
            sc = Scanner ( )
            a = sc.__next__ ( )
            b = sc.__next__ ( )
            c = sc.__next__ ( )
            print ( a * b / 2 )
        def __next__ ( self ) :
            while not line or not line.startswith ( "#" ) :
                try :
                    line = line.split ( )
                except ValueError :
                    pass
            return line
        def __next__ ( self ) :
            return int ( next ( ) )
        def __next__ ( self ) :
            data = ""
            try :
                data = next ( self )
            except StopIteration :
                pass
            return data
    return MyScanner ( ).__next__
