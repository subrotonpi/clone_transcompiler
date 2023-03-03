def import import os , sys , locale , string , count , encoding , errors , d
class A ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
        self.stdin = sys.stdin
        self.case = 'a2'
    def solve ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        self.out = sys.stdout
        self.stdin = sys.stdin
        self.N = sys.stdin.count ( '\n' )
        for t in range ( 1 , N + 1 ) :
            self.out.write ( 'Case #%d: ' % t )
            num = string.split ( num )
            dict = { }
            for c in string.split ( num ) :
                if c in dict :
                    continue
                if len ( dict ) == 0 :
                    dict [ c ] = 1
                elif len ( dict ) == 1 :
                    dict [ c ] = 0
                else :
                    dict [ c ] = len ( dict )
            result = 0
            base = dict.get ( 'base' , 0 )
            if base == 1 :
                base = 2
            for c in string.split ( num ) :
                result = result * base + dict [ c ]
            self.out.write ( result )
