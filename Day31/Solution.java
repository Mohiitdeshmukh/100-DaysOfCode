class Solution {
    public void flatten(TreeNode root) {
        
        if(root==null)
            return;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(true){
            
            if(root.right != null)
                stack.push(root.right);
            
            if(root.left==null){
                if(stack.isEmpty())
                    break;
                root.right = stack.pop();
            }
            else{
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
        
        return;
    }
}
