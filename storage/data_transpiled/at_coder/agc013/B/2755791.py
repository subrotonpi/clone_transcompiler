def import _main
class Main ( object ) :
    class Node :
        path = [ ]
    def main ( sc ) :
        n = sc.recv_number ( )
        nodes = [ Node ( ) for _ in range ( n ) ]
        m = sc.recv_number ( )
        for i in range ( m ) :
            a = sc.recv_number ( )
            b = sc.recv_number ( )
            nodes [ a - 1 ].path.append ( b )
            nodes [ b - 1 ].path.append ( a )
        tmp = nodes [ 0 ].path [ 0 ]
        bset = { 1 : tmp }
        ans = list ( range ( 1 , tmp ) )
        send = False
        eend = False
        while not send or not eend :
            if not send :
                send = True
                s = ans [ 0 ]
                for sp in nodes [ s - 1 ].path :
                    if sp not in bset :
                        bset [ sp ] = ans.append ( sp )
                        send = False
                        break
            if not eend :
                eend = True
                e = ans [ - 1 ]
                for ep in nodes [ e - 1 ].path :
                    if ep not in bset :
                        bset [ ep ] = ans.append ( ep )
                        eend = False
                        break
        ans = [ p for p in ans ]
        print ( len ( ans ) )
        print ( ' '.join ( ans ).strip ( ) )
    def main ( ) :
        sc = sys.stdin
        with open ( '/dev/tty.py' , 'r' ) as f :
            f.write ( str ( sc.read ( ) ) )
