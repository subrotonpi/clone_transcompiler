def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.po = sys.stdin.readline ( )
            c = po.split ( )
            c = [ i for i in c if i not in '' ]
            po = ''
            for i in c :
                po += i
        def __init__ ( self ) :
            self.po2 = sys.stdin.readline ( )
            c2 = po2.split ( )
            c2 = [ i for i in c2 if i not in '' ]
            po2 = ''
            for i in c2 :
                po2 += c2 [ - 1 - i ]
            print ( ( po < po2 ) and 'Yes' or 'No' )
