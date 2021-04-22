package treenode;

/**
 *
 * @author Anthony
 */
class TreeNode{
    County countyInfo;
    TreeNode left;
    TreeNode right;
    //BST root;
    TreeNode root;
    
    
    TreeNode(County county){
        this.left = null;
        this.right = null;
        this.countyInfo = county;
        //this.root = root;
        //this.root = null;
        
        
    }
    
    void insert(County v){
        if(this.countyInfo.compareTo(v) == 0){
      
        }
        else if(this.countyInfo.compareTo(v) == 1){
            if(this.left == null){
                this.left = new TreeNode(v);
                //System.out.println(this.countyInfo);
            }else{
                 this.left.insert(v);
                 
   
    }
        }else if(this.countyInfo.compareTo(v) == -1){
            if(this.right == null){
                this.right = new TreeNode(v);
            }else{
                //System.out.println(this.right);
                 this.right.insert(v);
                 //System.out.println(this.countyInfo);
   
    }
        }
       
    }
    
    /*void insertKey(County key){
        root = insert(root, key);
        System.out.println(root);
    }*/
    
   
    
    
    void delete(County v){
        if(this.countyInfo.compareTo(v) == 0){
            this.countyInfo = null;
        }
        
        else if(this.countyInfo.compareTo(v) == 1){
            this.left = new TreeNode(v);
            this.left.delete(v);
        } else if(this.countyInfo.compareTo(v) == -1){
            this.right = new TreeNode(v);
            this.right.delete(v);
        }else{
            if(this.left == null){
                //return this.right;
            }else if(this.right == null){
                //return this.left;
            }
        }
       
       
    }
    
   /* TreeNode deleteKey(County key){
        root = delete(root, key);
        return root;
    }*/
    
  
    
    void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.countyInfo);
            
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.countyInfo);
            inOrder(root.right);
            //System.out.println(root.countyInfo);
        }
    }
    
    String getString(TreeNode root){
        return root.toString();
    }

   
    
     
}

class BST{
    TreeNode root;
    
    BST(County first){
        this.root = new TreeNode (first);
    }
    
     
}

class County implements Comparable<County>{
    String name;
    int FIPS;
    String seat;
    long population;
    double area;
    
    County(String name, int FIPS, String seat, long population, double area){
        this.name = name;
        this.FIPS = FIPS;
        this.seat = seat;
        this.population = population;
        this.area = area;
      
    }
    
    @Override
    public int compareTo(County other){
        if(this.FIPS == other.FIPS){
            return 0;
        }else if(this.FIPS > other.FIPS){
            return 1;
        }else{
            return -1;
        }
    }
    
    @Override
      public String toString(){
        String result = "Name:" + name + " FIPS:" + FIPS + " Seat:" + seat + " Population:" + population + " Area:" + area;
        return result;
    }
}

