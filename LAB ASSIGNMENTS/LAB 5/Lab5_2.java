import java.util.*;

class Matrix {
    public int row,col;
    public int[][] arr;
    
    Matrix(int r,int c){
        row=r;
        col=c;
        arr=new int[row][col];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        // System.out.println(row + " " + col);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                System.out.println("Enter the element at row "+i+" and column "+j);
                this.arr[i][j]=sc.nextInt();
            }
        }
    }
    void print_matrix()
    {
        for(int i=0;i<this.rows();i++)
        {
            for(int j=0;j<this.cols();j++)
            {
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    int rows()
    {
        return row;
    }
    
    int cols()
    {
        return col;
    }
    
    void set_index(int i , int j)
    {
        if(i >= 0 && i <= row && j >= 0 && j <= col)
        {
            arr[i][j] = 1;
        }
        
        else
        {
            System.out.println("Invalid index");
        }
    }
    
    void add_matrix(Matrix obj)
    {   
        if(this.rows() == obj.rows() && this.cols() == obj.cols())
        {
            for(int i=0;i<this.rows();i++)
            {
                for(int j=0;j<this.cols();j++)
                {
                    this.arr[i][j] += obj.arr[i][j];
                }
            }
        }
        
        else
        {
            System.out.println("Invalid matrix");
        }
    }
    
    void multiply_matrix(Matrix obj)
    {
        if(col == obj.rows())
        {
            int[][] temp = new int[row][obj.cols()];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<obj.cols();j++)
                {
                    for(int k=0;k<col;k++)
                    {
                        temp[i][j] += arr[i][k] * obj.arr[k][j];
                    }
                }
            }
            arr = temp;
        }
        
        else
        {
            System.out.println("Matrices are not of same size");
        }
    }
    
    public static void main(String args[])
    {
        Matrix obj = new Matrix(2,2);
        Matrix obj1 = new Matrix(2,2);
        
        System.out.println("Input for 1st matrix ");
        
        obj.input();
        
        System.out.println("\nInput for 2nd matrix ");
        
        obj1.input();
        
        System.out.println("\n1st matrix ");
        obj.print_matrix();
        
        System.out.println("\n2nd matrix ");
        obj1.print_matrix();
        
        
        //System.out.println("\nSet Index Operation at index 1,1 :\n");
        //obj.set_index(1,1);
        
        //System.out.println("\nAdding the matrix we get :\n");
        
        //obj.add_matrix(obj1);
        
        System.out.println("\nMultiplying the matrix we get :\n");
        
        obj.multiply_matrix(obj1);
        
        obj.print_matrix();
    }
}
