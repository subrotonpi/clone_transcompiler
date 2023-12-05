def _import ( ) :
    from sys import stdin as PIPE
    from os import urandom
    from os import sep as ''
    class Main ( Scanner ) :
        def __init__ ( self ) :
            sc = stdin.readline ( ).rstrip ( '\n' )
            n = len ( s )
            if s [ 0 ] == s [ - 1 ] :
                if n % 2 == 0 :
                    flag = True
                else :
                    flag = False
            else :
                if n % 2 == 0 :
                    flag = False
                else :
                    flag = True
            if flag :
                self.next = raw_input ( )
            else :
                self.next = raw_input ( )
    class Printer ( stdout ) :
        def __init__ ( self ) :
            self.next = raw_input ( ).rstrip ( '\n' )
        def __call__ ( self ) :
            try :
                ch = next ( )
            except StopIteration :
                raise StopIteration
            else :
                while not is_printable ( ch ) :
                    ch = next ( )
        def __call__ ( self ) :
            try :
                return ch
            except StopIteration :
                raise StopIteration
    class Printer ( stdout ) :
        def __init__ ( self ) :
            self.next = raw_input ( ).rstrip ( '\n' )
        def __call__ ( self ) :
            try :
                ch = next ( )
            except StopIteration :
                raise StopIteration
            else :
                while is_printable ( ch ) :
                    ch = next ( )
        def __call__ ( self ) :
            try :
                ch = next ( )
            except StopIteration :
                raise StopIteration
            else :
                while is_printable ( ch ) :
                    ch = next ( )
    def __next__ ( self ) :
        try :
            negative = False
            res = 0
            limit = - sys.maxint
            radix = 10
            fc = next ( )
            if fc < '0' :
                negative = True
                limit = sys.maxint
            elif fc != '+' :
                raise StopIteration
            fc = next ( )
        except StopIteration :
            raise StopIteration
        else :
            return ch
return Printer ( )
