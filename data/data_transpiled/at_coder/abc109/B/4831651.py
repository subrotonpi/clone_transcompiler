def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
            self.list = [ ]
            self.hoge = self.hoge
            self.list.append ( self.hoge )
            for w in self.hoge :
                hoge = hoge [ - 1 ]
                hoge2 = w [ 0 ]
                if not hoge == hoge2 :
                    break
                elif self.list.find ( w ) > - 1 :
                    break
                else :
                    self.list.append ( w )
                    hoge = w
        print ( self.hoge and 'Yes' or 'No' , end = ' ' )
