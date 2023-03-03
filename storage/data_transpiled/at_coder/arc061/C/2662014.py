def _import ( ) :
    import sys
    import random
    import random
    import sys
    class Main ( ) :
        def __init__ ( self ) :
            self.n , self.m = 0 , 0
            self.graph = [ ]
            self.id_map = defaultdict ( int )
            def main ( self , args ) :
                super ( Main , self ).__init__ ( * args )
            def run ( self ) :
                sc = random.choice
                self.n , self.m = sc.n , sc.m
                self.graph = [ ]
                for i in range ( self.m ) :
                    p , q , c = next ( sc )
                    p0 = get_id ( p , 0 )
                    q0 = get_id ( q , 0 )
                    pc = get_id ( p , c )
                    qc = get_id ( q , c )
                    p0_list = self.graph [ p0 ]
                    q0_list = self.graph [ q0 ]
                    pc_list = self.graph [ pc ]
                    qc_list = self.graph [ qc ]
                    if not pc_list :
                        p0_list.append ( ( pc , 1 ) )
                        pc_list.append ( ( p0 , 0 ) )
                    pc_list.append ( ( qc , 0 ) )
                    if not qc_list :
                        q0_list.append ( ( qc , 1 ) )
                        qc_list.append ( ( q0 , 0 ) )
                    qc_list.append ( ( pc , 0 ) )
                self.solve ( )
        def solve ( self ) :
            start = get_id ( 1 , 0 )
            goal = get_id ( n , 0 )
            d = Dijkstra ( self.graph )
            d.shortest_path ( start )
            if d.distances [ goal ] == 1 << 60 :
                print ( - 1 )
            else :
                print ( d.distances [ goal ] )
        def get_id ( to , company ) :
            id = ( long ( to ) << 32 ) + company
            i = self.id_map.get ( id )
            if i is None :
                self.id_map [ id ] = i
            else :
                return i
    return Main ( )
