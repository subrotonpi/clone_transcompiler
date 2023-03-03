def _import ( ) :
    from os import getenv
    from os import open
    from os import getenv
    from os import getcwd
    from os.path import join
    from os import getcwd
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    from os import chdir
    class BaiA ( Node ) :
        class A :
            def __init__ ( self ) :
                self.p = sep
                self.name = join ( [ sep , sep ] )
                self.left , self.right = join ( [ sep , sep ] )
            def create ( self , s ) :
                s = s.strip ( )
                if s == '()' : return
                self.name = s [ 1 : - 1 ]
                with chdir ( chdir ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) ) :
                    self.res = Node ( )
                    self.p = float ( s )
        def get ( self ) :
            return self.p
    def calc ( n , ts ) :
        res = n.p
        if n.name :
            if n.name in ts :
                return res * calc ( n.left , ts )
            else :
                return res * calc ( n.right , ts )
        return res
    def main ( ) :
        with open ( 'A-large.in' , 'r' ) as sc :
            with open ( 'out.txt' , 'w' ) as f :
                ntest = len ( sc )
                for test in range ( 1 , ntest + 1 ) :
                    line = sc.readline ( )
                    sc.readline ( )
                    s = ''
                    for i in line :
                        s = s + ' ' + sc.readline ( )
                    root , n = create ( s )
                    f.write ( 'Case #%d:\n' % test )
                    for i in range ( n ) :
                        root , n = calc ( root , n )
                        f.write ( '%.7f\n' % n )
        return root
    main ( )
